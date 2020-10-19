package com.cg.addressbook;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.*;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.cg.addressbook.dto.*;
import com.cg.addressbook.exception.*;
import com.cg.addressbook.service.*;
import com.cg.addressbook.service.imp.*;
import com.cg.addressbook.validate.*;

public class AddressBookIOService {

	public static String CONTACT_FILE_NAME = "personContactFile.txt";
	public static final String CONTACT_FILE_NAME_CSV = "./person.csv";

	public List<PersonContact> readData() {
		List<PersonContact> contactsList = new ArrayList<>();
		try {
			Files.lines(new File(CONTACT_FILE_NAME).toPath()).forEach(line -> System.out.println(line));
			Files.lines(new File(CONTACT_FILE_NAME).toPath()).map(line -> line.trim()).forEach(line -> {
				String[] words = line.split("[\\s,:]+");
				for (String word : words) {
					System.out.println(word + " ");
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contactsList;
	}

	public long countEntries() {
		long entries = 0;
		try {
			entries = Files.lines(new File(CONTACT_FILE_NAME).toPath()).count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entries;
	}

	public void writeData(List<PersonContact> contactList) {
		StringBuffer empBuffer = new StringBuffer();
		contactList.forEach(contact -> {
			String employeeDataString = contact.toString().concat("\n");
			empBuffer.append(employeeDataString);
		});
		try {
			Files.write(Paths.get(CONTACT_FILE_NAME), empBuffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<PersonContact> readCSVData() {
		List<PersonContact> contactsList = new ArrayList<>();
		try {
			Reader reader = Files.newBufferedReader(Paths.get(CONTACT_FILE_NAME_CSV));
			CsvToBean<PersonContact> csvToBean = new CsvToBeanBuilder<PersonContact>(reader)
					.withType(PersonContact.class).withIgnoreLeadingWhiteSpace(true).build();

			contactsList = csvToBean.parse();
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return contactsList;
	}

	public boolean writeCSVData(List<PersonContact> contactList) {
		try (Writer writer = Files.newBufferedWriter(Paths.get(CONTACT_FILE_NAME_CSV))) {
			StatefulBeanToCsv<PersonContact> beanToCsv = new StatefulBeanToCsvBuilder<PersonContact>(writer)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();

			beanToCsv.write(contactList);
		} catch (CsvRequiredFieldEmptyException | CsvDataTypeMismatchException | IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}

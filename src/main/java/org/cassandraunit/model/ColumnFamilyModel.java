package org.cassandraunit.model;

import java.util.ArrayList;
import java.util.List;

import me.prettyprint.hector.api.ddl.ColumnType;
import me.prettyprint.hector.api.ddl.ComparatorType;

/**
 * 
 * @author Jeremy Sevellec
 * 
 */
public class ColumnFamilyModel {

	private String name;
	private ColumnType type = ColumnType.STANDARD;
	private ComparatorType keyType = ComparatorType.BYTESTYPE;
	private String keyTypeAlias = "";
	private ComparatorType comparatorType = ComparatorType.BYTESTYPE;
	private String comparatorTypeAlias = "";
	private ComparatorType subComparatorType = null;
	private ComparatorType defaultColumnValueType = null;

	private List<ColumnMetadata> columnsMetadata = new ArrayList<ColumnMetadata>();

	private List<RowModel> rows = new ArrayList<RowModel>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ColumnType getType() {
		return type;
	}

	public void setType(ColumnType type) {
		this.type = type;
	}

	public void setKeyType(ComparatorType keyType) {
		this.keyType = keyType;
	}

	public ComparatorType getKeyType() {
		return keyType;
	}

	public void setComparatorType(ComparatorType comparatorType) {
		this.comparatorType = comparatorType;
	}

	public ComparatorType getComparatorType() {
		return comparatorType;
	}

	public void setSubComparatorType(ComparatorType subComparatorType) {
		this.subComparatorType = subComparatorType;
	}

	public ComparatorType getSubComparatorType() {
		return subComparatorType;
	}

	public void setRows(List<RowModel> rows) {
		this.rows = rows;
	}

	public List<RowModel> getRows() {
		return rows;
	}

	public void setDefaultColumnValueType(ComparatorType defaultColumnValueType) {
		this.defaultColumnValueType = defaultColumnValueType;
	}

	public ComparatorType getDefaultColumnValueType() {
		return defaultColumnValueType;
	}

	public boolean isCounter() {
		return defaultColumnValueType != null && defaultColumnValueType.equals(ComparatorType.COUNTERTYPE);
	}

	public List<ColumnMetadata> getColumnsMetadata() {
		return columnsMetadata;
	}

	public void setColumnsMetadata(List<ColumnMetadata> columnsMetadata) {
		this.columnsMetadata = columnsMetadata;
	}

	public void addColumnMetadata(ColumnMetadata columnMetadata) {
		columnsMetadata.add(columnMetadata);
	}

	public String getComparatorTypeAlias() {
		return comparatorTypeAlias;
	}

	public void setComparatorTypeAlias(String comparatorTypeAlias) {
		this.comparatorTypeAlias = comparatorTypeAlias;
	}

	public String getKeyTypeAlias() {
		return keyTypeAlias;
	}

	public void setKeyTypeAlias(String keyTypeAlias) {
		this.keyTypeAlias = keyTypeAlias;
	}

}

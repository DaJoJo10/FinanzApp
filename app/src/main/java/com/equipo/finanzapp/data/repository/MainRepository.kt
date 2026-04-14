package com.equipo.finanzapp.data.repository

import com.equipo.finanzapp.data.local.ItemDao
import com.equipo.finanzapp.data.local.ItemEntity
import kotlinx.coroutines.flow.Flow

class MainRepository(private val itemDao: ItemDao) {

    val allItems: Flow<List<ItemEntity>> = itemDao.getAllItems()

    fun getItemStream(id: Int): Flow<ItemEntity?> = itemDao.getItemById(id)

    suspend fun insertItem(item: ItemEntity) = itemDao.insert(item)

    suspend fun deleteItem(item: ItemEntity) = itemDao.delete(item)

    suspend fun updateItem(item: ItemEntity) = itemDao.update(item)
}
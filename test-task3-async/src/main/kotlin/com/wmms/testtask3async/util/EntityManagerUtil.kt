package com.wmms.testtask3async.util

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

class EntityManagerUtil {
    companion object {
        var entityManagerFactory: EntityManagerFactory =
            Persistence.createEntityManagerFactory(
                "list");

        fun getEntityManager(): EntityManager {
            return entityManagerFactory.createEntityManager()
        }

        fun close() {
            entityManagerFactory.close()
        }
    }
}
package io.github.cepr0.crud.event;

import io.github.cepr0.crud.model.IdentifiableEntity;
import org.springframework.lang.NonNull;

public class UpdateEntityEvent<T extends IdentifiableEntity> {
	
	private final T entity;

	public UpdateEntityEvent(@NonNull final T entity) {
		this.entity = entity;
	}

	public T getEntity() {
		return entity;
	}
}

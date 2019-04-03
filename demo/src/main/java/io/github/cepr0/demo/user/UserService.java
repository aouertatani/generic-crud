/*
 * Copyright 2019 Generic-CRUD contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.cepr0.demo.user;

import io.github.cepr0.crud.service.AbstractCrudService;
import io.github.cepr0.demo.model.User;
import io.github.cepr0.demo.user.dto.UserRequest;
import io.github.cepr0.demo.user.dto.UserResponse;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudService<User, Long, UserRequest, UserResponse> {
	public UserService(@NonNull final UserRepo repo, @NonNull final UserMapper mapper) {
		super(repo, mapper);
	}
}

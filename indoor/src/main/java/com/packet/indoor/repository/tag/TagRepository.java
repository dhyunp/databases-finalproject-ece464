package com.packet.indoor.repository.tag;

import com.packet.indoor.domain.tag.Tag;
import com.packet.indoor.util.TagStatus;

import com.packet.indoor.util.TagStatus;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;
import java.util.List;
import java.util.UUID;

public interface TagRepository extends JpaRepository<Tag, UUID>{
    Optional<Tag> findByIdAndTagStatus(UUID id, TagStatus tagStatus);
    List<Tag> findAllByTagStatus(TagStatus tagStatus);
    List<Tag> findAllByTagStatusNot(TagStatus tagStatus);
}

package com.sparta.spring_init_template.domain.exam.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QExam is a Querydsl query type for Exam
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QExam extends EntityPathBase<Exam> {

    private static final long serialVersionUID = 91723796L;

    public static final QExam exam = new QExam("exam");

    public final com.sparta.spring_init_template.common.QTimeStampEntity _super = new com.sparta.spring_init_template.common.QTimeStampEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QExam(String variable) {
        super(Exam.class, forVariable(variable));
    }

    public QExam(Path<? extends Exam> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExam(PathMetadata metadata) {
        super(Exam.class, metadata);
    }

}


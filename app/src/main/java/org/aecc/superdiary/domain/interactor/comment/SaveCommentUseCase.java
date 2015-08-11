package org.aecc.superdiary.domain.interactor.comment;

import org.aecc.superdiary.domain.Comment;
import org.aecc.superdiary.domain.exception.ErrorBundle;
import org.aecc.superdiary.domain.interactor.Interactor;


public interface SaveCommentUseCase extends Interactor {
    interface Callback {
        void onCommentDataSaved(Comment comment);
        void onError(ErrorBundle errorBundle);
    }


    public void execute(Comment comment, Callback callback);
}
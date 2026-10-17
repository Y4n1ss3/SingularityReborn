package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface OperationErrorContext {
    List<ComposeStackTraceFrame> buildStackTrace(Integer num);

    boolean getSourceInformationEnabled();
}

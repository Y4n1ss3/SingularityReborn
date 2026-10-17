package androidx.compose.runtime.composer;

import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface GroupSourceInformation {
    boolean getClosed();

    int getDataEndOffset();

    int getDataStartOffset();

    ArrayList<Object> getGroups();

    int getKey();

    String getSourceInformation();
}

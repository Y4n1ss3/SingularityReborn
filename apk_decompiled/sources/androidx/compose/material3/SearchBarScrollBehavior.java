package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface SearchBarScrollBehavior {
    NestedScrollConnection getNestedScrollConnection();

    float getScrollOffset();

    float getScrollOffsetLimit();

    Modifier searchBarScrollBehavior(Modifier modifier);

    void setScrollOffset(float f);

    void setScrollOffsetLimit(float f);
}

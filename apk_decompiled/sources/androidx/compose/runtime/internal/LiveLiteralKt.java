package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LiveLiteralKt {
    private static boolean isLiveLiteralsEnabled;
    private static final HashMap<String, MutableState<Object>> liveLiteralCache = new HashMap<>();

    public static final void enableLiveLiterals() {
        isLiveLiteralsEnabled = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return isLiveLiteralsEnabled;
    }

    @ComposeCompilerApi
    public static final <T> State<T> liveLiteral(String str, T t) {
        HashMap<String, MutableState<Object>> hashMap = liveLiteralCache;
        MutableState<Object> mutableState = hashMap.get(str);
        if (mutableState == null) {
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            hashMap.put(str, mutableState);
        }
        mutableState.getClass();
        return mutableState;
    }

    public static final void updateLiveLiteralValue(String str, Object obj) {
        boolean z;
        HashMap<String, MutableState<Object>> hashMap = liveLiteralCache;
        MutableState<Object> mutableState = hashMap.get(str);
        if (mutableState == null) {
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            hashMap.put(str, mutableState);
            z = false;
        } else {
            z = true;
        }
        MutableState<Object> mutableState2 = mutableState;
        if (z) {
            mutableState2.setValue(obj);
        }
    }

    @ComposeCompilerApi
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }
}

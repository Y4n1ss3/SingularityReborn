package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import defpackage.ms;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InspectionTablesKt {
    private static final ProvidableCompositionLocal<Set<CompositionData>> LocalInspectionTables = CompositionLocalKt.staticCompositionLocalOf(new ms(5));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set LocalInspectionTables$lambda$0() {
        return null;
    }

    public static final ProvidableCompositionLocal<Set<CompositionData>> getLocalInspectionTables() {
        return LocalInspectionTables;
    }
}

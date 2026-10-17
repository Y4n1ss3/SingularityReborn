package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import defpackage.ky;
import defpackage.p80;
import defpackage.zi;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsModifierKt {
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        int L = p80.L(zi.a0(semanticsConfiguration, 10));
        if (L < 16) {
            L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(L);
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            linkedHashMap.put(entry.getKey().getName(), entry.getValue());
        }
        properties.set("properties", linkedHashMap);
    }

    public static final Modifier clearAndSetSemantics(Modifier modifier, ky kyVar) {
        return modifier.then(new ClearAndSetSemanticsElement(kyVar));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    public static final Modifier semantics(Modifier modifier, boolean z, ky kyVar) {
        return modifier.then(new AppendedSemanticsElement(z, kyVar));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semantics(modifier, z, kyVar);
    }
}

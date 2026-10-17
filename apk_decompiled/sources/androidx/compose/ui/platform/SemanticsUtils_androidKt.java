package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.ky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsUtils_androidKt {
    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    public static final Float getScrollViewportLength(SemanticsConfiguration semanticsConfiguration) {
        ky kyVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetScrollViewportLength());
        if (accessibilityAction == null || (kyVar = (ky) accessibilityAction.getAction()) == null || !((Boolean) kyVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult getTextLayoutResult(SemanticsConfiguration semanticsConfiguration) {
        ky kyVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (kyVar = (ky) accessibilityAction.getAction()) == null || !((Boolean) kyVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final View semanticsIdToView(AndroidViewsHandler androidViewsHandler, int i) {
        Object obj;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).getSemanticsId() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m6799toLegacyClassNameV4PA4sw(int i) {
        Role.Companion companion = Role.Companion;
        if (Role.m6824equalsimpl0(i, companion.m6828getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (Role.m6824equalsimpl0(i, companion.m6830getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m6824equalsimpl0(i, companion.m6833getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (Role.m6824equalsimpl0(i, companion.m6832getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m6824equalsimpl0(i, companion.m6831getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        if (Role.m6824equalsimpl0(i, companion.m6836getValuePickero7Vup1c())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}

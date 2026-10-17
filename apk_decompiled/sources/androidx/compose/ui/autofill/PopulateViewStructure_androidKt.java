package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsInfoKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import defpackage.ac;
import defpackage.fb0;
import defpackage.q10;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PopulateViewStructure_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x035a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void populate(ViewStructure viewStructure, SemanticsInfo semanticsInfo, AutofillId autofillId, String str, RectManager rectManager) {
        int i;
        long j;
        char c;
        long j2;
        boolean z;
        ToggleableState toggleableState;
        ContentDataType contentDataType;
        boolean z2;
        AnnotatedString annotatedString;
        AndroidFillableData androidFillableData;
        ContentType contentType;
        Boolean bool;
        Role role;
        boolean z3;
        Integer num;
        int i2;
        List list;
        Integer valueOf;
        boolean z4;
        boolean z5;
        String m6799toLegacyClassNameV4PA4sw;
        String[] contentHints;
        String[] contentHints2;
        fb0 props$ui;
        SemanticsProperties semanticsProperties;
        SemanticsProperties semanticsProperties2;
        int i3;
        fb0 props$ui2;
        ToggleableState toggleableState2;
        int i4;
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        int i5 = 8;
        int i6 = 1;
        if (semanticsConfiguration == null || (props$ui2 = semanticsConfiguration.getProps$ui()) == null) {
            i = 2;
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            z = true;
            toggleableState = null;
            contentDataType = null;
            z2 = false;
            annotatedString = null;
            androidFillableData = null;
            contentType = null;
            bool = null;
            role = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr = props$ui2.b;
            j = 255;
            Object[] objArr2 = props$ui2.c;
            long[] jArr = props$ui2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                z = true;
                i = 2;
                int i7 = 0;
                c = 7;
                contentDataType = null;
                z2 = false;
                toggleableState2 = null;
                annotatedString = null;
                androidFillableData = null;
                contentType = null;
                bool = null;
                role = null;
                z3 = false;
                num = null;
                j2 = -9187201950435737472L;
                while (true) {
                    long j3 = jArr[i7];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j3 & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj = objArr[i10];
                                Object obj2 = objArr2[i10];
                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                i4 = i5;
                                if (q10.b(semanticsPropertyKey, semanticsProperties3.getContentDataType())) {
                                    obj2.getClass();
                                    contentDataType = (ContentDataType) obj2;
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getContentDescription())) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) yi.q0((List) obj2);
                                    if (charSequence != null) {
                                        autofillApi26Helper.setContentDescription(viewStructure, charSequence);
                                    }
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getContentType())) {
                                    obj2.getClass();
                                    contentType = (ContentType) obj2;
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getFillableData())) {
                                    obj2.getClass();
                                    androidFillableData = (AndroidFillableData) obj2;
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getEditableText())) {
                                    obj2.getClass();
                                    annotatedString = (AnnotatedString) obj2;
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getFocused())) {
                                    obj2.getClass();
                                    autofillApi26Helper.setFocused(viewStructure, ((Boolean) obj2).booleanValue());
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getMaxTextLength())) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getPassword())) {
                                    z3 = true;
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getIsSensitiveData())) {
                                    obj2.getClass();
                                    z = ((Boolean) obj2).booleanValue();
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getRole())) {
                                    obj2.getClass();
                                    role = (Role) obj2;
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getSelected())) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (q10.b(semanticsPropertyKey, semanticsProperties3.getToggleableState())) {
                                    obj2.getClass();
                                    toggleableState2 = (ToggleableState) obj2;
                                } else if (q10.b(semanticsPropertyKey, semanticsActions.getOnClick())) {
                                    autofillApi26Helper.setClickable(viewStructure, true);
                                } else if (q10.b(semanticsPropertyKey, semanticsActions.getOnLongClick())) {
                                    autofillApi26Helper.setLongClickable(viewStructure, true);
                                } else if (q10.b(semanticsPropertyKey, semanticsActions.getRequestFocus())) {
                                    autofillApi26Helper.setFocusable(viewStructure, true);
                                } else if (q10.b(semanticsPropertyKey, semanticsActions.getSetText())) {
                                    z2 = true;
                                }
                            } else {
                                i4 = i5;
                            }
                            j3 >>= i4;
                            i9++;
                            i5 = i4;
                        }
                        if (i8 != i5) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    i5 = 8;
                }
            } else {
                i = 2;
                c = 7;
                j2 = -9187201950435737472L;
                z = true;
                contentDataType = null;
                z2 = false;
                toggleableState2 = null;
                annotatedString = null;
                androidFillableData = null;
                contentType = null;
                bool = null;
                role = null;
                z3 = false;
                num = null;
            }
            toggleableState = toggleableState2;
        }
        SemanticsConfiguration mergedSemanticsConfiguration = SemanticsInfoKt.mergedSemanticsConfiguration(semanticsInfo);
        if (mergedSemanticsConfiguration != null && (props$ui = mergedSemanticsConfiguration.getProps$ui()) != null) {
            Object[] objArr3 = props$ui.b;
            Object[] objArr4 = props$ui.c;
            long[] jArr2 = props$ui.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i11 = 0;
                list = null;
                while (true) {
                    long j4 = jArr2[i11];
                    if ((((~j4) << c) & j4 & j2) != j2) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j4 & j) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr3[i14];
                                Object obj4 = objArr4[i14];
                                i3 = i6;
                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) obj3;
                                semanticsProperties2 = semanticsProperties3;
                                if (q10.b(semanticsPropertyKey2, semanticsProperties2.getDisabled())) {
                                    autofillApi26Helper.setEnabled(viewStructure, false);
                                } else if (q10.b(semanticsPropertyKey2, semanticsProperties2.getText())) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                semanticsProperties2 = semanticsProperties3;
                                i3 = i6;
                            }
                            j4 >>= 8;
                            i13++;
                            semanticsProperties3 = semanticsProperties2;
                            i6 = i3;
                        }
                        semanticsProperties = semanticsProperties3;
                        i2 = i6;
                        if (i12 != 8) {
                            break;
                        }
                    } else {
                        semanticsProperties = semanticsProperties3;
                        i2 = i6;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i11++;
                    semanticsProperties3 = semanticsProperties;
                    i6 = i2;
                }
                Integer valueOf2 = Integer.valueOf(semanticsInfo.getSemanticsId());
                if (semanticsInfo.getParentInfo() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                autofillApi26Helper.setAutofillId(viewStructure, autofillId, intValue);
                autofillApi26Helper.setId(viewStructure, intValue, str, null, null);
                valueOf = contentDataType == null ? Integer.valueOf(ContentDataType_androidKt.getDataType(contentDataType)) : z2 ? Integer.valueOf(i2) : toggleableState != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    autofillApi26Helper.setAutofillType(viewStructure, valueOf.intValue());
                }
                if (annotatedString != null) {
                    autofillApi26Helper.setAutofillValue(viewStructure, autofillApi26Helper.getAutofillTextValue(annotatedString.getText()));
                }
                if (androidFillableData != null) {
                    autofillApi26Helper.setAutofillValue(viewStructure, androidFillableData.getAutofillValue$ui());
                }
                if (contentType != null && (contentHints2 = ContentType_androidKt.getContentHints(contentType)) != null) {
                    autofillApi26Helper.setAutofillHints(viewStructure, contentHints2);
                }
                rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new PopulateViewStructure_androidKt$populate$7(autofillApi26Helper, viewStructure));
                if (bool != null) {
                    autofillApi26Helper.setSelected(viewStructure, bool.booleanValue());
                }
                if (toggleableState == null) {
                    autofillApi26Helper.setCheckable(viewStructure, i2);
                    autofillApi26Helper.setChecked(viewStructure, toggleableState == ToggleableState.On);
                } else if (bool != null) {
                    if (!(role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), Role.Companion.m6835getTabo7Vup1c()))) {
                        autofillApi26Helper.setCheckable(viewStructure, true);
                        autofillApi26Helper.setChecked(viewStructure, bool.booleanValue());
                    }
                }
                String str2 = (String) ac.a0(ContentType_androidKt.getContentHints(ContentType.Companion.getPassword()));
                if (contentType != null || (contentHints = ContentType_androidKt.getContentHints(contentType)) == null) {
                    z4 = true;
                } else {
                    boolean L = ac.L(contentHints, str2);
                    z4 = true;
                    if (L) {
                        z5 = true;
                        boolean z6 = (!z3 || z5) ? z4 : false;
                        autofillApi26Helper.setDataIsSensitive(viewStructure, (!z6 || z) ? z4 : false);
                        autofillApi26Helper.setVisibility(viewStructure, semanticsInfo.isTransparent() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i15 = 0; i15 < size; i15++) {
                                str3 = str3 + ((AnnotatedString) list.get(i15)).getText() + '\n';
                            }
                            autofillApi26Helper.setText(viewStructure, str3);
                            autofillApi26Helper.setClassName(viewStructure, AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                        }
                        if (semanticsInfo.getChildrenInfo().isEmpty() && role != null && (m6799toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m6799toLegacyClassNameV4PA4sw(role.m6827unboximpl())) != null) {
                            autofillApi26Helper.setClassName(viewStructure, m6799toLegacyClassNameV4PA4sw);
                        }
                        if (z2) {
                            autofillApi26Helper.setClassName(viewStructure, AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                            if (num != null) {
                                AutofillApi28Helper.INSTANCE.setMaxTextLength(viewStructure, num.intValue());
                            }
                            if (z6) {
                                autofillApi26Helper.setInputType(viewStructure, 129);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z5 = false;
                if (z3) {
                }
                autofillApi26Helper.setDataIsSensitive(viewStructure, (!z6 || z) ? z4 : false);
                autofillApi26Helper.setVisibility(viewStructure, semanticsInfo.isTransparent() ? 4 : 0);
                if (list != null) {
                }
                if (semanticsInfo.getChildrenInfo().isEmpty()) {
                    autofillApi26Helper.setClassName(viewStructure, m6799toLegacyClassNameV4PA4sw);
                }
                if (z2) {
                }
            }
        }
        i2 = 1;
        list = null;
        Integer valueOf22 = Integer.valueOf(semanticsInfo.getSemanticsId());
        if (semanticsInfo.getParentInfo() == null) {
        }
        if (valueOf22 == null) {
        }
        autofillApi26Helper.setAutofillId(viewStructure, autofillId, intValue);
        autofillApi26Helper.setId(viewStructure, intValue, str, null, null);
        if (contentDataType == null) {
        }
        if (valueOf != null) {
        }
        if (annotatedString != null) {
        }
        if (androidFillableData != null) {
        }
        if (contentType != null) {
            autofillApi26Helper.setAutofillHints(viewStructure, contentHints2);
        }
        rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new PopulateViewStructure_androidKt$populate$7(autofillApi26Helper, viewStructure));
        if (bool != null) {
        }
        if (toggleableState == null) {
        }
        String str22 = (String) ac.a0(ContentType_androidKt.getContentHints(ContentType.Companion.getPassword()));
        if (contentType != null) {
        }
        z4 = true;
        z5 = false;
        if (z3) {
        }
        autofillApi26Helper.setDataIsSensitive(viewStructure, (!z6 || z) ? z4 : false);
        autofillApi26Helper.setVisibility(viewStructure, semanticsInfo.isTransparent() ? 4 : 0);
        if (list != null) {
        }
        if (semanticsInfo.getChildrenInfo().isEmpty()) {
        }
        if (z2) {
        }
    }
}

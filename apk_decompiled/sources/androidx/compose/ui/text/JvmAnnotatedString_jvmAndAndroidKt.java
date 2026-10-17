package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.ac;
import defpackage.b10;
import defpackage.d41;
import defpackage.ji0;
import defpackage.la0;
import defpackage.ny;
import defpackage.p;
import defpackage.p10;
import defpackage.s;
import defpackage.t;
import defpackage.tt;
import defpackage.w01;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class JvmAnnotatedString_jvmAndAndroidKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<?> range = list.get(i);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AnnotatedString transform(AnnotatedString annotatedString, ny nyVar) {
        ArrayList arrayList;
        Integer[] numArr = {0, Integer.valueOf(annotatedString.getText().length())};
        TreeSet treeSet = new TreeSet();
        ac.m0(numArr, treeSet);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text(), treeSet);
        ji0 ji0Var = new ji0();
        ji0Var.d = "";
        int i = b10.a;
        la0 la0Var = new la0();
        la0Var.g(0, 0);
        d41.f(2, 1);
        if ((treeSet instanceof RandomAccess) && (treeSet instanceof List)) {
            List list = (List) treeSet;
            int size = list.size();
            ArrayList arrayList2 = new ArrayList((size % 1 == 0 ? 0 : 1) + size);
            s sVar = new s(list);
            for (int i2 = 0; i2 >= 0 && i2 < size; i2++) {
                int i3 = size - i2;
                if (2 <= i3) {
                    i3 = 2;
                }
                if (i3 < 2) {
                    break;
                }
                int i4 = i3 + i2;
                p pVar = t.Companion;
                int size2 = sVar.g.size();
                pVar.getClass();
                p.c(i2, i4, size2);
                sVar.e = i2;
                sVar.f = i4 - i2;
                arrayList2.add(transform$lambda$0(ji0Var, nyVar, annotatedString, la0Var, sVar));
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = treeSet.iterator();
            it.getClass();
            Iterator y = !it.hasNext() ? tt.d : p10.y(new xq0(2, 1, it, true, false, null));
            while (y.hasNext()) {
                arrayList3.add(transform$lambda$0(ji0Var, nyVar, annotatedString, la0Var, (List) y.next()));
            }
        }
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text = annotatedString.getAnnotations$ui_text();
        if (annotations$ui_text != null) {
            arrayList = new ArrayList(annotations$ui_text.size());
            int size3 = annotations$ui_text.size();
            for (int i5 = 0; i5 < size3; i5++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text.get(i5);
                arrayList.add(new AnnotatedString.Range(range.getItem(), la0Var.d(range.getStart()), la0Var.d(range.getEnd())));
            }
        } else {
            arrayList = null;
        }
        return new AnnotatedString(arrayList, (String) ji0Var.d);
    }

    private static final w01 transform$lambda$0(ji0 ji0Var, ny nyVar, AnnotatedString annotatedString, la0 la0Var, List list) {
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        String str = ((String) ji0Var.d) + ((String) nyVar.invoke(annotatedString.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2)));
        ji0Var.d = str;
        la0Var.g(intValue2, str.length());
        return w01.a;
    }
}

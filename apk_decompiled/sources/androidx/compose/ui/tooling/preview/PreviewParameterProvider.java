package androidx.compose.ui.tooling.preview;

import defpackage.ao0;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PreviewParameterProvider<T> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            return PreviewParameterProvider.super.getCount();
        }

        @Deprecated
        public static <T> String getDisplayName(PreviewParameterProvider<T> previewParameterProvider, int i) {
            return PreviewParameterProvider.super.getDisplayName(i);
        }
    }

    default int getCount() {
        ao0 values = getValues();
        values.getClass();
        Iterator it = values.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    default String getDisplayName(int i) {
        return null;
    }

    ao0 getValues();
}

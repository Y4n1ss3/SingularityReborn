package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m7038isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m7537equalsimpl0(i, companion.m7547getEllipsisgIe3tQ8()) || TextOverflow.m7537equalsimpl0(i, companion.m7549getStartEllipsisgIe3tQ8()) || TextOverflow.m7537equalsimpl0(i, companion.m7548getMiddleEllipsisgIe3tQ8());
    }
}

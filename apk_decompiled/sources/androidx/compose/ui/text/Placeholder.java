package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    private Placeholder(long j, long j2, int i) {
        this.width = j;
        this.height = j2;
        this.placeholderVerticalAlign = i;
        if (TextUnit.m7803getRawTypeimpl(j) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (TextUnit.m7803getRawTypeimpl(j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m6969copyK8Q__8$default(Placeholder placeholder, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = placeholder.width;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = placeholder.height;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m6970copyK8Q__8(j3, j4, i);
    }

    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m6970copyK8Q__8(long j, long j2, int i) {
        return new Placeholder(j, j2, i, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m7802equalsimpl0(this.width, placeholder.width) && TextUnit.m7802equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m6977equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m6971getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m6972getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m6973getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return PlaceholderVerticalAlign.m6978hashCodeimpl(this.placeholderVerticalAlign) + ((TextUnit.m7806hashCodeimpl(this.height) + (TextUnit.m7806hashCodeimpl(this.width) * 31)) * 31);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m7812toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m7812toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m6979toStringimpl(this.placeholderVerticalAlign)) + ')';
    }

    public /* synthetic */ Placeholder(long j, long j2, int i, dq dqVar) {
        this(j, j2, i);
    }
}

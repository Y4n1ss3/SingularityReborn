package androidx.compose.ui.text;

import defpackage.fc;
import defpackage.j50;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ParagraphIntrinsicInfo {
    public static final int $stable = 8;
    private final int endIndex;
    private final ParagraphIntrinsics intrinsics;
    private final int startIndex;

    public ParagraphIntrinsicInfo(ParagraphIntrinsics paragraphIntrinsics, int i, int i2) {
        this.intrinsics = paragraphIntrinsics;
        this.startIndex = i;
        this.endIndex = i2;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo, ParagraphIntrinsics paragraphIntrinsics, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            paragraphIntrinsics = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i3 & 2) != 0) {
            i = paragraphIntrinsicInfo.startIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.copy(paragraphIntrinsics, i, i2);
    }

    public final ParagraphIntrinsics component1() {
        return this.intrinsics;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final ParagraphIntrinsicInfo copy(ParagraphIntrinsics paragraphIntrinsics, int i, int i2) {
        return new ParagraphIntrinsicInfo(paragraphIntrinsics, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        return q10.b(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.endIndex) + j50.b(this.startIndex, this.intrinsics.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.intrinsics);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        return fc.e(sb, this.endIndex, ')');
    }
}

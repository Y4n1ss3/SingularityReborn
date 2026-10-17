package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CollectionsBookmarkKt {
    private static ImageVector _collectionsBookmark;

    public static final ImageVector getCollectionsBookmark(Icons.TwoTone twoTone) {
        ImageVector imageVector = _collectionsBookmark;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CollectionsBookmark", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(20.0f, 4.0f, -1.0f, 9.0f);
        b.lineToRelative(-3.0f, -2.25f);
        uf.u(b, 13.0f, 13.0f, 4.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(b, 12.0f, 12.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = bv.b(4.0f, 22.0f, 14.0f, -2.0f);
        b2.lineTo(4.0f, 20.0f);
        b2.lineTo(4.0f, 6.0f);
        b2.lineTo(2.0f, 6.0f);
        b2.verticalLineToRelative(14.0f);
        b2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k4.r(b2, 22.0f, 16.0f, 22.0f, 4.0f);
        b2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b2.lineTo(8.0f, 2.0f);
        b2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b2.verticalLineToRelative(12.0f);
        b2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b2.horizontalLineToRelative(12.0f);
        b2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.B(b2, 15.0f, 4.0f, 2.0f, 5.0f);
        b2.lineToRelative(-1.0f, -0.75f);
        r6.C(b2, 15.0f, 9.0f, 15.0f, 4.0f);
        k4.C(b2, 8.0f, 4.0f, 5.0f, 9.0f);
        b2.lineToRelative(3.0f, -2.25f);
        b2.lineTo(19.0f, 13.0f);
        fc.w(b2, 19.0f, 4.0f, 1.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b2, 8.0f, 16.0f, 8.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _collectionsBookmark = build;
        build.getClass();
        return build;
    }
}

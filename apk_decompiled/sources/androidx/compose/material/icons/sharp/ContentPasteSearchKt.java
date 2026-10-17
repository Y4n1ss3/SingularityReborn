package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentPasteSearchKt {
    private static ImageVector _contentPasteSearch;

    public static final ImageVector getContentPasteSearch(Icons.Sharp sharp) {
        ImageVector imageVector = _contentPasteSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ContentPasteSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(5.0f, 5.0f, 2.0f, 3.0f, 10.0f);
        uf.p(n, 5.0f, 2.0f, 5.0f, 2.0f);
        n.verticalLineTo(3.0f);
        n.horizontalLineToRelative(-6.18f);
        n.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        n.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        uf.k(n, 3.0f, 18.0f, 7.0f, -2.0f);
        bv.s(n, 5.0f, 5.0f, 12.0f, 3.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        n.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(n, 11.45f, 3.0f, 12.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.3f, 18.9f);
        b.curveToRelative(0.4f, -0.7f, 0.7f, -1.5f, 0.7f, -2.4f);
        b.curveToRelative(0.0f, -2.5f, -2.0f, -4.5f, -4.5f, -4.5f);
        b.reflectiveCurveTo(12.0f, 14.0f, 12.0f, 16.5f);
        b.reflectiveCurveToRelative(2.0f, 4.5f, 4.5f, 4.5f);
        b.curveToRelative(0.9f, 0.0f, 1.7f, -0.3f, 2.4f, -0.7f);
        b.lineToRelative(2.7f, 2.7f);
        gy.B(b, 1.4f, -1.4f, 20.3f, 18.9f);
        b.moveTo(16.5f, 19.0f);
        b.curveToRelative(-1.4f, 0.0f, -2.5f, -1.1f, -2.5f, -2.5f);
        b.curveToRelative(0.0f, -1.4f, 1.1f, -2.5f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(2.5f, 1.1f, 2.5f, 2.5f);
        b.curveTo(19.0f, 17.9f, 17.9f, 19.0f, 16.5f, 19.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contentPasteSearch = build;
        build.getClass();
        return build;
    }
}

package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentPasteGoKt {
    private static ImageVector _contentPasteGo;

    public static final ImageVector getContentPasteGo(Icons.Filled filled) {
        ImageVector imageVector = _contentPasteGo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ContentPasteGo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(5.0f, 5.0f, 2.0f, 3.0f, 10.0f);
        uf.p(n, 5.0f, 2.0f, 6.0f, 2.0f);
        n.verticalLineTo(5.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineToRelative(-4.18f);
        n.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        n.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        n.horizontalLineTo(5.0f);
        n.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        n.verticalLineToRelative(14.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.t(n, 5.0f, -2.0f, 5.0f, 5.0f);
        n.moveTo(12.0f, 3.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        n.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(n, 11.45f, 3.0f, 12.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.01f, 13.0f, -1.42f, 1.41f);
        e.lineToRelative(1.58f, 1.58f);
        e.lineToRelative(-6.17f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(6.17f, 0.0f);
        e.lineToRelative(-1.58f, 1.59f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 1.42f, 1.41f, 3.99f, -4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contentPasteGo = build;
        build.getClass();
        return build;
    }
}

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoAccountsKt {
    private static ImageVector _noAccounts;

    public static final ImageVector getNoAccounts(Icons.Filled filled) {
        ImageVector imageVector = _noAccounts;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoAccounts", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.18f, 10.94f);
        b.curveToRelative(0.2f, -0.44f, 0.32f, -0.92f, 0.32f, -1.44f);
        b.curveTo(15.5f, 7.57f, 13.93f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(-0.52f, 0.0f, -1.0f, 0.12f, -1.44f, 0.32f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 15.18f, 10.94f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 15.0f);
        b2.curveToRelative(-2.32f, 0.0f, -4.45f, 0.8f, -6.14f, 2.12f);
        b2.curveTo(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f);
        b2.curveToRelative(0.0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f);
        b2.lineToRelative(2.86f, 2.86f);
        b2.curveToRelative(0.21f, 1.56f, 1.43f, 2.79f, 2.99f, 2.99f);
        b2.lineToRelative(2.2f, 2.2f);
        b2.curveTo(13.17f, 15.05f, 12.59f, 15.0f, 12.0f, 15.0f);
        k4.r(b2, 18.31f, 16.9f, 7.1f, 5.69f);
        b2.curveTo(8.45f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        b2.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        b2.curveTo(20.0f, 13.85f, 19.37f, 15.54f, 18.31f, 16.9f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noAccounts = build;
        build.getClass();
        return build;
    }
}

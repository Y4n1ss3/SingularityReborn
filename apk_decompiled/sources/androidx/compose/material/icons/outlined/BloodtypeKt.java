package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BloodtypeKt {
    private static ImageVector _bloodtype;

    public static final ImageVector getBloodtype(Icons.Outlined outlined) {
        ImageVector imageVector = _bloodtype;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Bloodtype", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(9.0f, 16.0f, 6.0f, 2.0f, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 9.0f, -2.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.0f, -2.0f);
        e.lineToRelative(2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -2.0f, -2.0f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
        b.curveToRelative(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        b.reflectiveCurveToRelative(8.0f, -3.22f, 8.0f, -8.2f);
        b.curveTo(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-3.35f, 0.0f, -6.0f, -2.57f, -6.0f, -6.2f);
        b.curveToRelative(0.0f, -2.34f, 1.95f, -5.44f, 6.0f, -9.14f);
        b.curveToRelative(4.05f, 3.7f, 6.0f, 6.79f, 6.0f, 9.14f);
        b.curveTo(18.0f, 17.43f, 15.35f, 20.0f, 12.0f, 20.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bloodtype = build;
        build.getClass();
        return build;
    }
}

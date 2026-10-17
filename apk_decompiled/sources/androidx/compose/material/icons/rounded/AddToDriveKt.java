package androidx.compose.material.icons.rounded;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddToDriveKt {
    private static ImageVector _addToDrive;

    public static final ImageVector getAddToDrive(Icons.Rounded rounded) {
        ImageVector imageVector = _addToDrive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddToDrive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 11.0f);
        b.curveToRelative(0.17f, 0.0f, 0.33f, 0.01f, 0.49f, 0.02f);
        b.lineTo(15.0f, 3.0f);
        b.horizontalLineTo(9.0f);
        b.lineToRelative(5.68f, 9.84f);
        b.curveTo(15.77f, 11.71f, 17.3f, 11.0f, 19.0f, 11.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(8.15f, 4.52f, -6.15f, 10.98f), 3.0f, 5.5f, 6.33f, -10.97f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(13.2f, 15.5f, 9.9f, 6.73f, 21.0f);
        l.horizontalLineToRelative(7.81f);
        l.curveTo(13.58f, 19.94f, 13.0f, 18.54f, 13.0f, 17.0f);
        l.curveTo(13.0f, 16.48f, 13.07f, 15.98f, 13.2f, 15.5f);
        l.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, l.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.0f, 16.0f, 0.0f, -3.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 3.0f);
        e.lineToRelative(-3.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(3.0f, 0.0f);
        e.lineToRelative(0.0f, 3.0f);
        e.lineToRelative(1.0f, 0.0f);
        e.lineToRelative(1.0f, 0.0f);
        e.lineToRelative(0.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 3.0f, 0.0f, 0.0f, -2.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addToDrive = build;
        build.getClass();
        return build;
    }
}

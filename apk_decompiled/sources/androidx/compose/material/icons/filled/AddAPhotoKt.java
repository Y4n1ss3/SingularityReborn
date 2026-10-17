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
import defpackage.af0;
import defpackage.bv;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAPhotoKt {
    private static ImageVector _addAPhoto;

    public static final ImageVector getAddAPhoto(Icons.Filled filled) {
        ImageVector imageVector = _addAPhoto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddAPhoto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(3.0f, 4.0f, 1.0f, 2.0f, 3.0f);
        af0.z(c, 3.0f, 2.0f, 5.0f, 3.0f);
        af0.y(c, 3.0f, 6.0f, 0.0f, 4.0f);
        af0.x(c, 3.0f, 6.0f, 10.0f, 7.0f);
        af0.f(c, 3.0f, 4.0f, 7.0f);
        c.lineToRelative(1.83f, 2.0f);
        c.horizontalLineTo(21.0f);
        c.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        c.verticalLineToRelative(12.0f);
        c.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        c.horizontalLineTo(5.0f);
        c.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        bv.z(c, 10.0f, 6.0f, 13.0f, 19.0f);
        c.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        c.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        c.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        c.reflectiveCurveTo(10.24f, 19.0f, 13.0f, 19.0f);
        c.close();
        c.moveTo(9.8f, 14.0f);
        c.curveToRelative(0.0f, 1.77f, 1.43f, 3.2f, 3.2f, 3.2f);
        c.reflectiveCurveToRelative(3.2f, -1.43f, 3.2f, -3.2f);
        c.reflectiveCurveToRelative(-1.43f, -3.2f, -3.2f, -3.2f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 9.8f, 12.23f, 9.8f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAPhoto = build;
        build.getClass();
        return build;
    }
}

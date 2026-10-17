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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoCameraKt {
    private static ImageVector _photoCamera;

    public static final ImageVector getPhotoCamera(Icons.TwoTone twoTone) {
        ImageVector imageVector = _photoCamera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhotoCamera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 6.0f, -4.05f, -1.83f, -2.0f);
        i.lineTo(9.88f, 4.0f);
        i.lineTo(8.05f, 6.0f);
        af0.m(i, 4.0f, 6.0f, 12.0f, 16.0f);
        uo.l(i, 20.0f, 6.0f, 12.0f, 17.0f);
        i.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        i.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        i.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -2.24f, 5.0f, -5.0f, 5.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(4.0f, 20.0f, 16.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.lineTo(22.0f, 6.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.horizontalLineToRelative(-3.17f);
        a.lineTo(15.0f, 2.0f);
        a.lineTo(9.0f, 2.0f);
        a.lineTo(7.17f, 4.0f);
        a.lineTo(4.0f, 4.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(12.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.l(a, 4.0f, 6.0f, 4.05f);
        a.lineToRelative(1.83f, -2.0f);
        a.horizontalLineToRelative(4.24f);
        a.lineToRelative(1.83f, 2.0f);
        a.lineTo(20.0f, 6.0f);
        a.verticalLineToRelative(12.0f);
        r6.C(a, 4.0f, 18.0f, 4.0f, 6.0f);
        a.moveTo(12.0f, 7.0f);
        a.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        a.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        a.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        a.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        a.close();
        a.moveTo(12.0f, 15.0f);
        a.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        a.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        a.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(a, -1.35f, 3.0f, -3.0f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoCamera = build;
        build.getClass();
        return build;
    }
}

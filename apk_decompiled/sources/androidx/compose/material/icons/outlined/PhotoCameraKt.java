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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoCameraKt {
    private static ImageVector _photoCamera;

    public static final ImageVector getPhotoCamera(Icons.Outlined outlined) {
        ImageVector imageVector = _photoCamera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PhotoCamera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.12f, 4.0f, 1.83f, 2.0f);
        e.lineTo(20.0f, 6.0f);
        e.verticalLineToRelative(12.0f);
        e.lineTo(4.0f, 18.0f);
        e.lineTo(4.0f, 6.0f);
        kf0.B(e, 4.05f, 1.83f, -2.0f, 4.24f);
        e.moveTo(15.0f, 2.0f);
        e.lineTo(9.0f, 2.0f);
        e.lineTo(7.17f, 4.0f);
        e.lineTo(4.0f, 4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(12.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.lineTo(22.0f, 6.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        gy.n(e, -3.17f, 15.0f, 2.0f);
        e.moveTo(12.0f, 9.0f);
        e.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        e.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        e.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        e.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        e.moveToRelative(0.0f, -2.0f);
        e.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        e.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        e.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -2.24f, -5.0f, -5.0f, -5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoCamera = build;
        build.getClass();
        return build;
    }
}

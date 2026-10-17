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
import defpackage.af0;
import defpackage.bv;
import defpackage.j50;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAPhotoKt {
    private static ImageVector _addAPhoto;

    public static final ImageVector getAddAPhoto(Icons.Outlined outlined) {
        ImageVector imageVector = _addAPhoto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddAPhoto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(21.0f, 6.0f, -3.17f, 16.0f, 4.0f);
        kf0.x(p, -6.0f, 2.0f, 5.12f);
        p.lineToRelative(1.83f, 2.0f);
        p.lineTo(21.0f, 8.0f);
        bv.q(p, 12.0f, 5.0f, 20.0f, -9.0f);
        p.lineTo(3.0f, 11.0f);
        p.verticalLineToRelative(9.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(16.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(23.0f, 8.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p.close();
        p.moveTo(8.0f, 14.0f);
        p.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        p.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        p.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        p.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        p.close();
        p.moveTo(13.0f, 11.0f);
        p.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        p.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        p.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        p.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        af0.l(p, 5.0f, 6.0f, 3.0f);
        p.lineTo(8.0f, 4.0f);
        p.lineTo(5.0f, 4.0f);
        p.lineTo(5.0f, 1.0f);
        p.lineTo(3.0f, 1.0f);
        bv.q(p, 3.0f, 0.0f, 4.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.v(p, 3.0f, 3.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAPhoto = build;
        build.getClass();
        return build;
    }
}

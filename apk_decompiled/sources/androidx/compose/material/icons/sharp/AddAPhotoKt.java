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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAPhotoKt {
    private static ImageVector _addAPhoto;

    public static final ImageVector getAddAPhoto(Icons.Sharp sharp) {
        ImageVector imageVector = _addAPhoto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AddAPhoto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(3.0f, 4.0f, 3.0f, 1.0f, 2.0f);
        kf0.z(k, 3.0f, 3.0f, 2.0f);
        k.lineTo(5.0f, 6.0f);
        k.verticalLineToRelative(3.0f);
        k.lineTo(3.0f, 9.0f);
        k.lineTo(3.0f, 6.0f);
        k.lineTo(0.0f, 6.0f);
        uf.j(k, 0.0f, 4.0f, 3.0f);
        k.moveTo(6.0f, 10.0f);
        k.lineTo(6.0f, 7.0f);
        uo.n(k, 3.0f, 9.0f, 4.0f, 7.0f);
        k.lineToRelative(1.83f, 2.0f);
        k.lineTo(23.0f, 6.0f);
        k.verticalLineToRelative(16.0f);
        k.lineTo(3.0f, 22.0f);
        uf.j(k, 3.0f, 10.0f, 3.0f);
        k.moveTo(13.0f, 19.0f);
        k.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        k.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        k.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        k.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        k.close();
        k.moveTo(10.0f, 14.0f);
        k.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        k.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        k.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(k, -3.0f, 1.34f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAPhoto = build;
        build.getClass();
        return build;
    }
}

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
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoSizeSelectActualKt {
    private static ImageVector _photoSizeSelectActual;

    public static final ImageVector getPhotoSizeSelectActual(Icons.TwoTone twoTone) {
        ImageVector imageVector = _photoSizeSelectActual;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhotoSizeSelectActual", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(3.08f, 5.0f, 3.0f, 5.08f, 19.0f);
        u.horizontalLineToRelative(17.92f);
        u.curveToRelative(0.03f, -0.02f, 0.06f, -0.06f, 0.08f, -0.08f);
        u.verticalLineTo(5.08f);
        u.lineTo(20.92f, 5.0f);
        u.horizontalLineTo(3.08f);
        u.close();
        u.moveTo(5.0f, 17.0f);
        u.lineToRelative(3.5f, -4.5f);
        u.lineToRelative(2.5f, 3.01f);
        u.lineTo(14.5f, 11.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(u, 4.5f, 6.0f, 5.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 3.0f, 3.0f, 3.0f);
        i.curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(18.0f);
        i.curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f);
        i.lineTo(23.0f, 5.0f);
        i.curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(21.0f, 18.92f);
        i.curveToRelative(-0.02f, 0.03f, -0.06f, 0.06f, -0.08f, 0.08f);
        i.lineTo(3.0f, 19.0f);
        i.lineTo(3.0f, 5.08f);
        i.lineTo(3.08f, 5.0f);
        i.horizontalLineToRelative(17.83f);
        i.curveToRelative(0.03f, 0.02f, 0.06f, 0.06f, 0.08f, 0.08f);
        r6.l(i, 13.84f, 11.0f, 15.51f);
        i.lineTo(8.5f, 12.5f);
        i.lineTo(5.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.g(i, 14.0f, -4.5f, -6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoSizeSelectActual = build;
        build.getClass();
        return build;
    }
}

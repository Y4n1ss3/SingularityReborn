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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VillaKt {
    private static ImageVector _villa;

    public static final ImageVector getVilla(Icons.Outlined outlined) {
        ImageVector imageVector = _villa;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Villa", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 10.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.horizontalLineToRelative(-1.0f);
        b.verticalLineTo(3.0f);
        b.lineTo(3.0f, 8.0f);
        kf0.z(b, 13.0f, 18.0f, -9.0f);
        b.curveTo(21.0f, 10.9f, 20.1f, 10.0f, 19.0f, 10.0f);
        k4.x(b, 5.0f, 9.37f, 9.0f, -3.46f);
        b.verticalLineTo(12.0f);
        b.horizontalLineTo(9.0f);
        b.verticalLineToRelative(7.0f);
        b.horizontalLineTo(5.0f);
        k4.D(b, 9.37f, 19.0f, 19.0f, -3.0f);
        r6.D(b, -3.0f, -2.0f, 3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(b, -5.0f, 8.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _villa = build;
        build.getClass();
        return build;
    }
}

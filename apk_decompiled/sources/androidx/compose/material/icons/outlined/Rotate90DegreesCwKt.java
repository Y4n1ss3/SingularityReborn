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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Rotate90DegreesCwKt {
    private static ImageVector _rotate90DegreesCw;

    public static final ImageVector getRotate90DegreesCw(Icons.Outlined outlined) {
        ImageVector imageVector = _rotate90DegreesCw;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Rotate90DegreesCw", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(2.0f, 13.0f);
        b.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        b.curveToRelative(1.76f, 0.0f, 3.4f, -0.51f, 4.79f, -1.38f);
        b.lineToRelative(-1.46f, -1.46f);
        b.curveTo(13.34f, 19.69f, 12.2f, 20.0f, 11.0f, 20.0f);
        b.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        b.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        b.horizontalLineToRelative(0.17f);
        b.lineTo(9.59f, 7.59f);
        b.lineTo(11.0f, 9.0f);
        b.lineToRelative(4.0f, -4.0f);
        b.lineToRelative(-4.0f, -4.0f);
        b.lineTo(9.58f, 2.41f);
        b.lineTo(11.17f, 4.0f);
        b.horizontalLineTo(11.0f);
        b.curveTo(6.03f, 4.0f, 2.0f, 8.03f, 2.0f, 13.0f);
        k4.x(b, 11.0f, 13.0f, 6.0f, 6.0f);
        b.lineToRelative(6.0f, -6.0f);
        gy.B(b, -6.0f, -6.0f, 11.0f, 13.0f);
        b.moveTo(17.0f, 16.17f);
        b.lineTo(13.83f, 13.0f);
        b.lineTo(17.0f, 9.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 20.17f, 13.0f, 17.0f, 16.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCw = build;
        build.getClass();
        return build;
    }
}

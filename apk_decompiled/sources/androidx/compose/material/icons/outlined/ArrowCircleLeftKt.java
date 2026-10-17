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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArrowCircleLeftKt {
    private static ImageVector _arrowCircleLeft;

    public static final ImageVector getArrowCircleLeft(Icons.Outlined outlined) {
        ImageVector imageVector = _arrowCircleLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ArrowCircleLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.close();
        b.moveTo(20.0f, 12.0f);
        b.curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b.curveTo(16.42f, 4.0f, 20.0f, 7.58f, 20.0f, 12.0f);
        k4.x(b, 8.0f, 12.0f, 4.0f, -4.0f);
        b.lineToRelative(1.41f, 1.41f);
        r6.w(b, 11.83f, 11.0f, 16.0f, 2.0f);
        b.horizontalLineToRelative(-4.17f);
        b.lineToRelative(1.59f, 1.59f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 12.0f, 16.0f, 8.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowCircleLeft = build;
        build.getClass();
        return build;
    }
}

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
import defpackage.fc;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MuseumKt {
    private static ImageVector _museum;

    public static final ImageVector getMuseum(Icons.Rounded rounded) {
        ImageVector imageVector = _museum;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Museum", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.5f, 11.0f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.verticalLineTo(9.26f);
        b.curveToRelative(0.0f, -0.16f, -0.08f, -0.32f, -0.21f, -0.41f);
        b.lineTo(12.57f, 2.4f);
        b.curveToRelative(-0.34f, -0.24f, -0.8f, -0.24f, -1.15f, 0.0f);
        b.lineTo(2.21f, 8.85f);
        b.curveTo(2.08f, 8.94f, 2.0f, 9.1f, 2.0f, 9.26f);
        b.verticalLineToRelative(1.24f);
        b.curveTo(2.0f, 10.78f, 2.22f, 11.0f, 2.5f, 11.0f);
        r6.y(b, 4.0f, 9.0f, 3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(18.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        kp0.j(b, -1.0f, -9.0f, 21.5f);
        b.moveTo(16.0f, 17.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-3.0f);
        b.lineToRelative(-1.17f, 1.75f);
        b.curveToRelative(-0.4f, 0.59f, -1.27f, 0.59f, -1.66f, 0.0f);
        b.lineTo(10.0f, 14.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-4.7f);
        b.curveTo(8.0f, 11.58f, 8.58f, 11.0f, 9.3f, 11.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.43f, 0.0f, 0.84f, 0.22f, 1.08f, 0.58f);
        b.lineTo(12.0f, 14.0f);
        b.lineToRelative(1.61f, -2.42f);
        b.curveTo(13.86f, 11.22f, 14.26f, 11.0f, 14.7f, 11.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.72f, 0.0f, 1.3f, 0.58f, 1.3f, 1.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _museum = build;
        build.getClass();
        return build;
    }
}

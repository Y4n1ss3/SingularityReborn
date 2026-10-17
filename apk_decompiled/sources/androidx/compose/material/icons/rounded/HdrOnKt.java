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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrOnKt {
    private static ImageVector _hdrOn;

    public static final ImageVector getHdrOn(Icons.Rounded rounded) {
        ImageVector imageVector = _hdrOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HdrOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.25f, 9.0f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        b.lineTo(6.5f, 11.0f);
        b.horizontalLineToRelative(-2.0f);
        b.lineTo(4.5f, 9.75f);
        b.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        b.reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f);
        b.verticalLineToRelative(4.5f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        fc.w(b, 4.5f, 12.5f, 2.0f, 1.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        b.verticalLineToRelative(-4.5f);
        b.curveTo(8.0f, 9.34f, 7.66f, 9.0f, 7.25f, 9.0f);
        bv.v(b, 21.0f, 11.5f, -1.0f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.lineTo(17.0f, 9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.25f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        b.lineTo(17.5f, 13.0f);
        b.horizontalLineToRelative(1.1f);
        b.lineToRelative(0.72f, 1.59f);
        b.curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f);
        b.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.96f);
        b.lineToRelative(-0.49f, -1.14f);
        b.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        uo.C(b, 17.5f, 11.5f, -1.0f, 2.0f);
        kf0.C(b, 1.0f, -2.0f, 13.0f, 9.0f);
        b.horizontalLineToRelative(-3.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.verticalLineToRelative(5.0f);
        b.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.82f, 0.0f, 1.5f, -0.68f, 1.5f, -1.5f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f);
        r6.B(b, 13.0f, 13.5f, -2.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(b, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOn = build;
        build.getClass();
        return build;
    }
}

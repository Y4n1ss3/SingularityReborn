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
import defpackage.af0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediationKt {
    private static ImageVector _mediation;

    public static final ImageVector getMediation(Icons.Sharp sharp) {
        ImageVector imageVector = _mediation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Mediation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.0f, 13.0f, -5.06f);
        a.curveToRelative(-0.34f, 3.1f, -2.26f, 5.72f, -4.94f, 7.05f);
        a.curveTo(7.96f, 21.69f, 6.64f, 23.0f, 5.0f, 23.0f);
        a.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        a.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        a.curveToRelative(0.95f, 0.0f, 1.78f, 0.45f, 2.33f, 1.14f);
        a.curveToRelative(1.9f, -1.03f, 3.26f, -2.91f, 3.58f, -5.14f);
        a.horizontalLineToRelative(-3.1f);
        a.curveTo(7.4f, 14.16f, 6.3f, 15.0f, 5.0f, 15.0f);
        a.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        a.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        a.curveToRelative(1.3f, 0.0f, 2.4f, 0.84f, 2.82f, 2.0f);
        a.horizontalLineToRelative(3.1f);
        a.curveTo(10.6f, 8.77f, 9.23f, 6.9f, 7.33f, 5.86f);
        a.curveTo(6.78f, 6.55f, 5.95f, 7.0f, 5.0f, 7.0f);
        a.curveTo(3.34f, 7.0f, 2.0f, 5.66f, 2.0f, 4.0f);
        a.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        a.curveToRelative(1.64f, 0.0f, 2.96f, 1.31f, 2.99f, 2.95f);
        a.curveToRelative(2.68f, 1.33f, 4.6f, 3.95f, 4.94f, 7.05f);
        a.horizontalLineTo(18.0f);
        a.verticalLineTo(8.0f);
        a.lineToRelative(4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(a, -4.0f, 4.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediation = build;
        build.getClass();
        return build;
    }
}

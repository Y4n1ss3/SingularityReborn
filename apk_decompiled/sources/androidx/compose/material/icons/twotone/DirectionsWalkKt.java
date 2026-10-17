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
import defpackage.er;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsWalkKt {
    private static ImageVector _directionsWalk;

    public static final ImageVector getDirectionsWalk(Icons.TwoTone twoTone) {
        ImageVector imageVector = _directionsWalk;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DirectionsWalk", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.5f, 5.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        k4.r(b, 9.8f, 8.9f, 7.0f, 23.0f);
        b.horizontalLineToRelative(2.1f);
        b.lineToRelative(1.8f, -8.0f);
        r6.A(b, 2.1f, 2.0f, 6.0f, 2.0f);
        b.verticalLineToRelative(-7.5f);
        b.lineToRelative(-2.1f, -2.0f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveTo(14.8f, 12.0f, 16.8f, 13.0f, 19.0f, 13.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-1.9f, 0.0f, -3.5f, -1.0f, -4.3f, -2.4f);
        b.lineToRelative(-1.0f, -1.6f);
        b.curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.65f, -0.84f);
        fc.t(b, 6.0f, 8.3f, 13.0f, 2.0f);
        b.verticalLineTo(9.6f);
        b.lineToRelative(1.8f, -0.7f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsWalk = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getDirectionsWalk$annotations(Icons.TwoTone twoTone) {
    }
}

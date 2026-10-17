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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PendingActionsKt {
    private static ImageVector _pendingActions;

    public static final ImageVector getPendingActions(Icons.TwoTone twoTone) {
        ImageVector imageVector = _pendingActions;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PendingActions", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(18.65f, 19.35f, -2.15f, -2.15f, 14.0f);
        bv.p(j, 1.0f, 2.79f, 1.85f, 1.85f);
        uo.l(j, 18.65f, 19.35f, 17.0f, 10.0f);
        j.curveToRelative(0.34f, 0.0f, 0.67f, 0.03f, 1.0f, 0.08f);
        j50.B(j, 5.0f, -2.0f, 3.0f, 8.0f);
        bv.A(j, 5.0f, 6.0f, 15.0f, 4.68f);
        j.curveTo(10.25f, 19.09f, 10.0f, 18.08f, 10.0f, 17.0f);
        j.curveTo(10.0f, 13.13f, 13.13f, 10.0f, 17.0f, 10.0f);
        j.close();
        j.moveTo(12.0f, 5.0f);
        j.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        j.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        j.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        j.curveTo(13.0f, 4.55f, 12.55f, 5.0f, 12.0f, 5.0f);
        j.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 12.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        k4.x(b, 18.65f, 19.35f, -2.15f, -2.15f);
        kf0.r(b, 14.0f, 1.0f, 2.79f);
        gy.B(b, 1.85f, 1.85f, 18.65f, 19.35f);
        b.moveTo(18.0f, 3.0f);
        b.horizontalLineToRelative(-3.18f);
        b.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        b.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        b.horizontalLineTo(6.0f);
        b.curveTo(4.9f, 3.0f, 4.0f, 3.9f, 4.0f, 5.0f);
        b.verticalLineToRelative(15.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(6.11f);
        b.curveToRelative(-0.59f, -0.57f, -1.07f, -1.25f, -1.42f, -2.0f);
        kf0.o(b, 6.0f, 5.0f, 2.0f, 3.0f);
        af0.q(b, 8.0f, 5.0f, 2.0f, 5.08f);
        b.curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f);
        b.verticalLineTo(5.0f);
        b.curveTo(20.0f, 3.9f, 19.1f, 3.0f, 18.0f, 3.0f);
        b.close();
        b.moveTo(12.0f, 5.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.curveTo(13.0f, 4.55f, 12.55f, 5.0f, 12.0f, 5.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pendingActions = build;
        build.getClass();
        return build;
    }
}

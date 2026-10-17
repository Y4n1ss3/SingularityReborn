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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssignmentIndKt {
    private static ImageVector _assignmentInd;

    public static final ImageVector getAssignmentInd(Icons.Outlined outlined) {
        ImageVector imageVector = _assignmentInd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AssignmentInd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 3.0f, -4.18f);
        a.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        a.reflectiveCurveToRelative(-2.4f, 0.84f, -2.82f, 2.0f);
        a.lineTo(5.0f, 3.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(14.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(14.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.lineTo(21.0f, 5.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.close();
        a.moveTo(12.0f, 2.75f);
        a.curveToRelative(0.22f, 0.0f, 0.41f, 0.1f, 0.55f, 0.25f);
        a.curveToRelative(0.12f, 0.13f, 0.2f, 0.31f, 0.2f, 0.5f);
        a.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        a.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        a.curveToRelative(0.0f, -0.19f, 0.08f, -0.37f, 0.2f, -0.5f);
        a.curveToRelative(0.14f, -0.15f, 0.33f, -0.25f, 0.55f, -0.25f);
        k4.r(a, 19.0f, 19.0f, 5.0f, 19.0f);
        r6.m(a, 5.0f, 5.0f, 14.0f, 14.0f);
        a.moveTo(12.0f, 6.0f);
        a.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        a.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        a.reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f);
        a.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        a.close();
        a.moveTo(12.0f, 10.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        k4.r(a, 6.0f, 16.47f, 6.0f, 18.0f);
        a.horizontalLineToRelative(12.0f);
        a.verticalLineToRelative(-1.53f);
        a.curveToRelative(0.0f, -2.5f, -3.97f, -3.58f, -6.0f, -3.58f);
        a.reflectiveCurveToRelative(-6.0f, 1.07f, -6.0f, 3.58f);
        a.close();
        a.moveTo(8.31f, 16.0f);
        a.curveToRelative(0.69f, -0.56f, 2.38f, -1.12f, 3.69f, -1.12f);
        a.reflectiveCurveToRelative(3.01f, 0.56f, 3.69f, 1.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 8.31f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assignmentInd = build;
        build.getClass();
        return build;
    }
}

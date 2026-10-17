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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssignmentLateKt {
    private static ImageVector _assignmentLate;

    public static final ImageVector getAssignmentLate(Icons.Outlined outlined) {
        ImageVector imageVector = _assignmentLate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AssignmentLate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(11.0f, 15.0f, 2.0f, 2.0f, -2.0f);
        k4.C(q, 11.0f, 7.0f, 2.0f, 6.0f);
        kp0.A(q, -2.0f, 19.0f, 3.0f, -4.18f);
        q.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        q.curveToRelative(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        q.lineTo(5.0f, 3.0f);
        q.curveToRelative(-0.14f, 0.0f, -0.27f, 0.01f, -0.4f, 0.04f);
        q.curveToRelative(-0.39f, 0.08f, -0.74f, 0.28f, -1.01f, 0.55f);
        q.curveToRelative(-0.18f, 0.18f, -0.33f, 0.4f, -0.43f, 0.64f);
        q.curveToRelative(-0.1f, 0.23f, -0.16f, 0.49f, -0.16f, 0.77f);
        q.verticalLineToRelative(14.0f);
        q.curveToRelative(0.0f, 0.27f, 0.06f, 0.54f, 0.16f, 0.78f);
        q.reflectiveCurveToRelative(0.25f, 0.45f, 0.43f, 0.64f);
        q.curveToRelative(0.27f, 0.27f, 0.62f, 0.47f, 1.01f, 0.55f);
        q.curveToRelative(0.13f, 0.02f, 0.26f, 0.03f, 0.4f, 0.03f);
        q.horizontalLineToRelative(14.0f);
        q.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q.lineTo(21.0f, 5.0f);
        q.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q.close();
        q.moveTo(12.0f, 2.75f);
        q.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        q.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        q.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        q.reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f);
        k4.r(q, 19.0f, 19.0f, 5.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(q, 5.0f, 5.0f, 14.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assignmentLate = build;
        build.getClass();
        return build;
    }
}

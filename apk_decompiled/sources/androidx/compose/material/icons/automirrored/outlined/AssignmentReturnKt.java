package androidx.compose.material.icons.automirrored.outlined;

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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssignmentReturnKt {
    private static ImageVector _assignmentReturn;

    public static final ImageVector getAssignmentReturn(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _assignmentReturn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.AssignmentReturn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(12.0f, 14.0f, 4.0f, -4.0f, -4.0f);
        n.lineTo(12.0f, 7.0f);
        fc.C(n, -5.0f, 5.0f, 5.0f, 5.0f);
        n.moveTo(19.0f, 3.0f);
        n.horizontalLineToRelative(-4.18f);
        n.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        n.curveToRelative(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        n.lineTo(5.0f, 3.0f);
        n.curveToRelative(-0.14f, 0.0f, -0.27f, 0.01f, -0.4f, 0.04f);
        n.curveToRelative(-0.39f, 0.08f, -0.74f, 0.28f, -1.01f, 0.55f);
        n.curveToRelative(-0.18f, 0.18f, -0.33f, 0.4f, -0.43f, 0.64f);
        n.curveToRelative(-0.1f, 0.23f, -0.16f, 0.49f, -0.16f, 0.77f);
        n.verticalLineToRelative(14.0f);
        n.curveToRelative(0.0f, 0.27f, 0.06f, 0.54f, 0.16f, 0.78f);
        n.reflectiveCurveToRelative(0.25f, 0.45f, 0.43f, 0.64f);
        n.curveToRelative(0.27f, 0.27f, 0.62f, 0.47f, 1.01f, 0.55f);
        n.curveToRelative(0.13f, 0.02f, 0.26f, 0.03f, 0.4f, 0.03f);
        n.horizontalLineToRelative(14.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.lineTo(21.0f, 5.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.close();
        n.moveTo(12.0f, 2.75f);
        n.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        n.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        n.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        n.reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f);
        k4.r(n, 19.0f, 19.0f, 5.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 5.0f, 5.0f, 14.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assignmentReturn = build;
        build.getClass();
        return build;
    }
}

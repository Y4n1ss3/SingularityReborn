package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssignmentLateKt {
    private static ImageVector _assignmentLate;

    public static final ImageVector getAssignmentLate(Icons.Filled filled) {
        ImageVector imageVector = _assignmentLate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AssignmentLate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 3.0f, -4.18f);
        a.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        a.curveToRelative(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        a.lineTo(5.0f, 3.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(14.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(14.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.lineTo(21.0f, 5.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(a, 13.0f, 18.0f, -2.0f, -2.0f);
        fc.x(a, 2.0f, 2.0f, 13.0f, 14.0f);
        uo.n(a, -2.0f, 11.0f, 8.0f, 2.0f);
        r6.l(a, 6.0f, 12.0f, 5.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(a, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assignmentLate = build;
        build.getClass();
        return build;
    }
}

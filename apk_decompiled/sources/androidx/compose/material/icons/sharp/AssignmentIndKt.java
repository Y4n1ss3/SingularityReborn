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
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssignmentIndKt {
    private static ImageVector _assignmentInd;

    public static final ImageVector getAssignmentInd(Icons.Sharp sharp) {
        ImageVector imageVector = _assignmentInd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AssignmentInd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(21.0f, 3.0f, -6.18f);
        a.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        a.reflectiveCurveToRelative(-2.4f, 0.84f, -2.82f, 2.0f);
        af0.m(a, 3.0f, 3.0f, 18.0f, 18.0f);
        uo.l(a, 21.0f, 3.0f, 12.0f, 3.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.close();
        a.moveTo(12.0f, 7.0f);
        a.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        a.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        a.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        a.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        k4.r(a, 18.0f, 19.0f, 6.0f, 19.0f);
        a.verticalLineToRelative(-1.4f);
        a.curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f);
        a.reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 18.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assignmentInd = build;
        build.getClass();
        return build;
    }
}

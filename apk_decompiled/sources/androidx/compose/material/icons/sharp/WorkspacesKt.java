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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WorkspacesKt {
    private static ImageVector _workspaces;

    public static final ImageVector getWorkspaces(Icons.Sharp sharp) {
        ImageVector imageVector = _workspaces;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Workspaces", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 13.0f);
        b.curveToRelative(-2.2f, 0.0f, -4.0f, 1.8f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.8f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.8f, 4.0f, -4.0f);
        b.reflectiveCurveTo(8.2f, 13.0f, 6.0f, 13.0f);
        b.close();
        b.moveTo(12.0f, 3.0f);
        b.curveTo(9.8f, 3.0f, 8.0f, 4.8f, 8.0f, 7.0f);
        b.reflectiveCurveToRelative(1.8f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.8f, 4.0f, -4.0f);
        b.reflectiveCurveTo(14.2f, 3.0f, 12.0f, 3.0f);
        b.close();
        b.moveTo(18.0f, 13.0f);
        b.curveToRelative(-2.2f, 0.0f, -4.0f, 1.8f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.8f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.8f, 4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 20.2f, 13.0f, 18.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workspaces = build;
        build.getClass();
        return build;
    }
}

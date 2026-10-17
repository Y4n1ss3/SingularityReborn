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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddModeratorKt {
    private static ImageVector _addModerator;

    public static final ImageVector getAddModerator(Icons.Filled filled) {
        ImageVector imageVector = _addModerator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddModerator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.22f, 22.61f);
        b.curveToRelative(-0.4f, 0.15f, -0.8f, 0.29f, -1.22f, 0.39f);
        b.curveToRelative(-5.16f, -1.26f, -9.0f, -6.45f, -9.0f, -12.0f);
        b.verticalLineTo(5.0f);
        b.lineToRelative(9.0f, -4.0f);
        b.lineToRelative(9.0f, 4.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 0.9f, -0.11f, 1.78f, -0.3f, 2.65f);
        b.curveToRelative(-0.81f, -0.41f, -1.73f, -0.65f, -2.7f, -0.65f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        b.curveToRelative(0.0f, 1.36f, 0.46f, 2.61f, 1.22f, 3.61f);
        bv.v(b, 19.0f, 20.0f, 2.99f);
        b.reflectiveCurveToRelative(-1.99f, 0.01f, -2.0f, 0.0f);
        uf.p(b, 20.0f, -3.0f, -2.0f, 3.0f);
        r6.D(b, -3.0f, 2.0f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(b, 2.0f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addModerator = build;
        build.getClass();
        return build;
    }
}

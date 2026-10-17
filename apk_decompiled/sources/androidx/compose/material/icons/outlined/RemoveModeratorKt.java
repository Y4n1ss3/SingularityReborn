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
import defpackage.gy;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveModeratorKt {
    private static ImageVector _removeModerator;

    public static final ImageVector getRemoveModerator(Icons.Outlined outlined) {
        ImageVector imageVector = _removeModerator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RemoveModerator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(12.0f, 4.14f, 6.0f, 2.25f, 4.7f);
        e.curveToRelative(0.0f, 1.19f, -0.23f, 2.36f, -0.64f, 3.44f);
        e.lineToRelative(1.51f, 1.51f);
        e.curveToRelative(0.72f, -1.53f, 1.13f, -3.22f, 1.13f, -4.95f);
        e.verticalLineTo(5.0f);
        e.lineToRelative(-8.0f, -3.0f);
        e.lineTo(6.78f, 3.96f);
        gy.B(e, 1.55f, 1.55f, 12.0f, 4.14f);
        e.moveTo(2.81f, 2.81f);
        e.lineTo(1.39f, 4.22f);
        e.lineTo(4.0f, 6.83f);
        e.verticalLineToRelative(4.26f);
        e.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        e.curveToRelative(1.72f, -0.43f, 3.28f, -1.36f, 4.55f, -2.62f);
        e.lineToRelative(3.23f, 3.23f);
        gy.B(e, 1.41f, -1.41f, 2.81f, 2.81f);
        e.moveTo(12.0f, 19.92f);
        e.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        e.verticalLineTo(8.83f);
        e.lineToRelative(9.14f, 9.14f);
        e.curveTo(14.24f, 18.85f, 13.17f, 19.54f, 12.0f, 19.92f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeModerator = build;
        build.getClass();
        return build;
    }
}

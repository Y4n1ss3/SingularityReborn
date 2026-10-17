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
import defpackage.bv;
import defpackage.gy;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveModeratorKt {
    private static ImageVector _removeModerator;

    public static final ImageVector getRemoveModerator(Icons.TwoTone twoTone) {
        ImageVector imageVector = _removeModerator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RemoveModerator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 11.09f);
        b.curveToRelative(0.0f, 4.0f, 2.55f, 7.7f, 6.0f, 8.83f);
        b.curveToRelative(1.17f, -0.38f, 2.24f, -1.07f, 3.14f, -1.95f);
        uf.o(b, 6.0f, 8.83f, 11.09f);
        b.moveTo(12.0f, 4.14f);
        b.lineTo(8.34f, 5.51f);
        b.lineToRelative(9.02f, 9.02f);
        b.curveToRelative(0.41f, -1.08f, 0.64f, -2.25f, 0.64f, -3.44f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(b, -4.7f, 12.0f, 4.14f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeModerator = build;
        build.getClass();
        return build;
    }
}

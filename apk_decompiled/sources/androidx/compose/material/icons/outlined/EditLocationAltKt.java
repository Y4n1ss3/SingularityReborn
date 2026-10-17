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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditLocationAltKt {
    private static ImageVector _editLocationAlt;

    public static final ImageVector getEditLocationAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _editLocationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditLocationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(11.0f, 11.0f, 2.12f, 6.16f, -6.16f);
        i.lineToRelative(-2.12f, -2.12f);
        uf.o(i, 11.0f, 8.88f, 11.0f);
        i.moveTo(20.71f, 2.0f);
        i.lineTo(20.0f, 1.29f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(-0.72f, 0.72f);
        i.lineToRelative(2.12f, 2.12f);
        i.lineToRelative(0.72f, -0.72f);
        i.curveTo(21.1f, 3.02f, 21.1f, 2.39f, 20.71f, 2.0f);
        i.close();
        i.moveTo(17.9f, 9.05f);
        i.curveTo(17.96f, 9.41f, 18.0f, 9.79f, 18.0f, 10.2f);
        i.curveToRelative(0.0f, 1.71f, -1.08f, 4.64f, -6.0f, 9.14f);
        i.curveToRelative(-4.92f, -4.49f, -6.0f, -7.43f, -6.0f, -9.14f);
        i.curveTo(6.0f, 6.17f, 9.09f, 4.0f, 12.0f, 4.0f);
        i.curveToRelative(0.32f, 0.0f, 0.65f, 0.03f, 0.97f, 0.08f);
        i.lineToRelative(1.65f, -1.65f);
        i.curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f);
        i.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        i.curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f);
        i.curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f);
        i.curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 17.9f, 9.05f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocationAlt = build;
        build.getClass();
        return build;
    }
}

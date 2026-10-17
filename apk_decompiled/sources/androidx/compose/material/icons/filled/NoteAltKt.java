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
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoteAltKt {
    private static ImageVector _noteAlt;

    public static final ImageVector getNoteAlt(Icons.Filled filled) {
        ImageVector imageVector = _noteAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoteAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 3.0f, -4.18f);
        a.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        a.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        a.horizontalLineTo(5.0f);
        a.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        a.verticalLineToRelative(14.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(14.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineTo(5.0f);
        a.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        a.close();
        a.moveTo(12.0f, 2.75f);
        a.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        a.reflectiveCurveTo(12.41f, 4.25f, 12.0f, 4.25f);
        a.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        a.reflectiveCurveTo(11.59f, 2.75f, 12.0f, 2.75f);
        uo.q(a, 9.1f, 17.0f, 7.0f, -2.14f);
        a.lineToRelative(5.96f, -5.96f);
        gy.B(a, 2.12f, 2.12f, 9.1f, 17.0f);
        a.moveTo(16.85f, 9.27f);
        a.lineToRelative(-1.06f, 1.06f);
        a.lineToRelative(-2.12f, -2.12f);
        a.lineToRelative(1.06f, -1.06f);
        a.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        a.lineToRelative(1.41f, 1.41f);
        a.curveTo(17.05f, 8.76f, 17.05f, 9.07f, 16.85f, 9.27f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noteAlt = build;
        build.getClass();
        return build;
    }
}

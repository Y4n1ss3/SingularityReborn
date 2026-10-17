package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.text.TextRange;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PasswordInputTransformation implements InputTransformation {
    public static final int $stable = 0;
    private final MutableIntState revealCodepointIndex$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
    private final iy scheduleHide;

    public PasswordInputTransformation(iy iyVar) {
        this.scheduleHide = iyVar;
    }

    private final void setRevealCodepointIndex(int i) {
        this.revealCodepointIndex$delegate.setIntValue(i);
    }

    public final int getRevealCodepointIndex$foundation() {
        return this.revealCodepointIndex$delegate.getIntValue();
    }

    public final iy getScheduleHide() {
        return this.scheduleHide;
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChanges().getChangeCount() != 1 || TextRange.m7056getLengthimpl(textFieldBuffer.getChanges().mo1236getRangejx7JFs(0)) != 1 || textFieldBuffer.hasSelection()) {
            setRevealCodepointIndex(-1);
            return;
        }
        int m7058getMinimpl = TextRange.m7058getMinimpl(textFieldBuffer.getChanges().mo1236getRangejx7JFs(0));
        if (getRevealCodepointIndex$foundation() != m7058getMinimpl) {
            this.scheduleHide.invoke();
            setRevealCodepointIndex(m7058getMinimpl);
        }
    }
}

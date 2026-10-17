package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultImeEditCommandScope implements ImeEditCommandScope {
    public static final int $stable = 8;
    private int batchDepth;
    private final MutableVector<ky> editCommands = new MutableVector<>(new ky[16], 0);
    private final TransformedTextFieldState transformedTextFieldState;

    public DefaultImeEditCommandScope(TransformedTextFieldState transformedTextFieldState) {
        this.transformedTextFieldState = transformedTextFieldState;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        this.batchDepth++;
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(ky kyVar) {
        beginBatchEdit();
        this.editCommands.add(kyVar);
        endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean endBatchEdit() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && this.editCommands.getSize() != 0) {
            TransformedTextFieldState transformedTextFieldState = this.transformedTextFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
            TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
            MutableVector<ky> mutableVector = this.editCommands;
            ky[] kyVarArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                kyVarArr[i2].invoke(mainBuffer$foundation);
            }
            transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
            textFieldState.commitEditAsUser(inputTransformation, false, textFieldEditUndoBehavior);
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI */
    public long mo1267mapFromTransformedGEjPoXI(long j) {
        return this.transformedTextFieldState.m1362mapFromTransformedGEjPoXI(j);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI */
    public long mo1268mapToTransformedGEjPoXI(long j) {
        return this.transformedTextFieldState.m1364mapToTransformedGEjPoXI(j);
    }
}
